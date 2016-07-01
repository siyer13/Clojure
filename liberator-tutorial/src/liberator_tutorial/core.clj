(ns liberator-tutorial.core
  (:require [liberator.core :refer [resource defresource]]
            [ring.middleware.params :refer [wrap-params]]
            [compojure.core :refer [defroutes ANY]]))

(defroutes app
  (ANY "/foo" [] (resource :available-media-types ["text/html"]
                          :handle-ok "<html>Hello, Internet</html>")))

(defroutes app1
  (ANY "/foo" [] (resource :available-media-types ["text/html"]
                           :handle-ok (fn [ctx]
                                (format "<html> It's %d milliseconds since
                                the beginning of the epoch"
                                (System/currentTimeMillis))))))
(def handler
  ( -> app1
       wrap-params))
