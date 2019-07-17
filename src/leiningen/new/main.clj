(ns leiningen.new.main
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "main"))

(defn main
  "Leiningen template for minimal Clojure project."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' main project.")
    (->files data
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)]
             ["main.clj" (render "main.clj" data)]
             [".gitignore" (render "gitignore" data)])))
