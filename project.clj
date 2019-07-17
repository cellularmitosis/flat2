(defproject main/lein-template "0.1.1"
  :description "Leiningen template for minimal Clojure project."
  :eval-in-leiningen true
  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org/repo"}]
                       ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]])
