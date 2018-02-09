(ns cj-server.sockets-test
  (:require [clojure.test :refer :all]
            [cj-server.sockets :as sockets]))


(deftest server-socket-test
  (testing "when given a port, returns a server-socket"
    (let [socket (sockets/server-socket 8080)]
      (is (= true (instance? java.net.ServerSocket socket)))
      (sockets/close socket))))
