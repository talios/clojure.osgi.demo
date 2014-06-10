(ns com.theoryinpractise.clojureosgi.demo
  (:require [clojure.osgi.services :as os]))

(defn- bundle-start [context]
  "Register OSGi service"
  (println "Starting OSGi from Clojure")
  (try (os/register-service
         Runnable
         (run [_]
           (println "Helllo")) )
       (catch Exception e
         (println "Unable to register services"))))

(defn- bundle-stop [context]
  (println "bundle-stop is called"))
