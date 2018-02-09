(ns cj-server.logger-test
  (:require [clojure.test :refer :all])
  (:require [cj-server.logger :refer :all]))

(deftest base-header-test
  (testing "return the base header"
    (is (= base "[CJ-SERVER] "))))

(deftest info-header-test
  (testing "returns the info header"
    (is (= info "[CJ-SERVER] INFO: "))))

(deftest error-header-test
  (testing "returns the info header"
    (is (= error "[CJ-SERVER] ERROR: "))))
