(ns cj-server.logger
  (:require [clojure.string :as str :refer :all]))

(def base "[CJ-SERVER] ")

(def info (str/join [base "INFO: "]))

(def error (str/join [base "ERROR: "]))

(defn log [level & args]
    (doseq [i args] (println (clojure.string/join [level i]))))

