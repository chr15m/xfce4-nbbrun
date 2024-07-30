(ns script
  (:require
    ["fs" :as fs]
    [promesa.core :as p]
    [applied-science.js-interop :as j]
    ["zx" :refer [$ cd fetch]]
    [nbb.repl :as repl]))

(repl/repl {})
