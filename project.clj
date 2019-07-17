(defproject main/lein-template "0.1.0"
  :description "Leiningen template for minimal Clojure project."
  :eval-in-leiningen true
  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org"}]
                       ["snapshots" {:sign-releases false :url "https://clojars.org"}]])
