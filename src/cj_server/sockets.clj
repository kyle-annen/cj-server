(ns cj-server.sockets
  (:import (java.net ServerSocket)
           (java.io InputStreamReader OutputStream BufferedReader BufferedWriter BufferedOutputStream DataOutputStream)))

(defn server-socket
  [port]
  (ServerSocket. port))

(defn close
  [socket]
  (.close socket))

(defn accept
  [socket]
  (.accept socket))

(defn buffered-reader
  [client-socket]
  (BufferedReader. (InputStreamReader. (.getInputStream client-socket))))


(defn buffered-output-stream
  [client-socket]
  (BufferedOutputStream. (.getOutputStream client-socket)))

(defn data-output-stream
  [client-socket]
  (DataOutputStream. (BufferedOutputStream. (.getOutputStream client-socket))))
