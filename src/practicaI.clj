(ns practicaI
  (:require [clojure.set :as set]))

;; Lorenzo Ferreyra
;; 0. Declare una variable con su alumno_uflo y apellido. Escriba en un comentario qué 
;;    tipo de dato ha empleado.
  
(def alumno_uflo "Lorenzo Ferreyra")
(type alumno_uflo)
;; 1. Cree un vector de números positivos impares hasta el número 21
(def mi-vector (vec (filter even? (range 1 22))))


(type(def mi-vector (vec (filter even? (range 1 22)))))


;; 2. Registre los jugadores de dos equipos de basket y dos de fútbol 5. 
;;    Al menos 3 jugadores juegan fútbol y basket. Utilice conjuntos

(def basket #{"Juan" "Pedro" "Luis" "Sofía" "Ana"})
(def futbol_5 #{"Juan" "Sofía" "Carlos" "María" "Jorge"})

;; 2.1 Desde la Dirección de Deportes nos piden una lista (lo que no implica 
;;     devolver esta estructura de datos) de todos los jugadores de ambos
;;     deportes. PISTA: utilizar la función (set/union) -ya el namespace está
;;     requerido arriba con el alias 'set'.
(def jugadores_lista (clojure.set/union basket futbol_5))


;; 2.2 Identifique los jugadores que participan en ambas disciplinas. PISTA: 
;;     Existe una función de conjuntos en el namespace 'clojure.set' para resolver este problema.
(def jugadores_comunes (clojure.set/intersection basket futbol_5))



;; 2.3 Identifique los jugadores que juegan fútbol, pero no basket. PISTA:
;;     Existe una función de conjuntos en el namespace 'clojure.set' para resolver este problema.
(def juegan_solo_futbol (clojure.set/difference futbol_5 basket))


;; 3. Cree un mapa con los 5 principales indicadores provistos en la página del INDEC
;;    (https://www.indec.gob.ar/), a saber, población, desocupación, etc. 

(def indicadores_indec {:inflacion 7.7 :poblacion 46044703 :desocupacion 6.3 :prod -1.3 :actividad 0.3 })

;; 3.1 Utilice la función (juxt) para obtener los valores correspondientes a las llaves 
;;     que haya elegido para los indicadores 'Tasa de desocupación' e 'Índice de producción industrial 
;;     manufacturero'. 
;;     NOTA: Al ubicar el cursor sobre la función, podrá ver una ventLionel con la documentación y ejemplos.

((juxt :desocupacion :prod) indicadores_indec)



;; 3.2 Utilice la función (select-keys) para obtener un mapa con el par llave-valor 
;;     con las llaves que haya elegido para los indicadores 'Población' y 'Precios al consumidor'.

(select-keys indicadores_indec [:poblacion :inflacion])

;; 4. Cree una función que, recibiendo un alumno_uflo como argumento, devuelva un saludo. Ejemplo:
;;    (saludar "Lorenzo") => "¡Hola, Lorenzo!"

(defn saludar [alumno]
  (str "¡Hola, " alumno "!"))
(saludar "Lorenzo")
(comment 
;; Utilice este espacio para experimentar con el código. Luego, cuando esté seguro que el 
;; código trabaja correctamente, cópielo a su lugar correspondiente arriba.   
 (+ 2 2 )
  (saludar "Lorenzo")
)
