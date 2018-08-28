(defproject mybank "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.6"]]
  :ring {:handler mybank.core/app
         :auto-reload? true
         :auto-refresh? false}
  :dependencies [[org.clojure/clojure "1.8.0"]
                [ring/ring "1.2.0"]
                [compojure "1.2.0-SNAPSHOT"]
                [ring/ring-json "0.2.0"]])
