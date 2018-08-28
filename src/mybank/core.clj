(ns mybank.core
  (:use compojure.core
        ring.middleware.json
        ring.util.response)
  (:require [compojure.route :as route]
            [mybank.view :as view])) ;define os plugins a serem usados pelo namespace
    ; no caso, está-se usando o compojure que é um router do ring

(defn foo [x] (str "Hello, " x))

(defroutes my_routes 
  (GET "/" [] (view/index-page))
  (GET "/rest" [] (response {:email "andereluisflor@live.com"}))
  (route/resources "/"))

(def app (wrap-json-response my_routes))