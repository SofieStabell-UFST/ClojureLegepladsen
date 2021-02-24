(ns clojure-notes.core ; namespace
  (:gen-class))

; _____________Definer Constanter - Eksempler________
;Man bruger def til at definere:
(def intNavn 2)
(def stringNavn "Dette er en string")
(def vectorNavn ["Harry Potter" "Peter Kanin"])
(def mapNavn {:fornavn "Anders" :efternavn "And" :alder 55}) ; :key value
(def nestedMapNavn {:navn {:fornavn "Mickey" :efternavn "Mouse"}})
(def listNavn '(3 2 1 "Ready for Takeoff!"))



;________________Funktions Eksempler_________________
(defn funktion-opbygnings-eksempel
  "Forklarende kommentar kan skrives her"
  [& args]
  (println "Hello, World!"))

(defn if-exampel []
  (if true
    "Dette er resultatet hvis true"
    "Dette er resultatet hvis flase (else statement resultatet)"))

(defn if-Argument-eksempel
  "I dette eksempel bruges argumentet [severity] i funktionen som true i if.
   ALTSÅ: gives :mild i funktionskaldet er if true, ellers falsk"
  [severity]
  (str "OH MY GOD! IT A DISASTER! WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOOOOOOOMED!")))

(defn if-do-exampel
  "Do lader os gøre flere ting i et if "
  []
  (if true
    (do (println "Print denne ting")
        "og output denne ting hvis true")
    (do (println "Eller print denne ting")
        "og output denne ting hvis false")))

(defn when-exampel
  "lader os gøre flere ting så længe true.
   Retunerer ALTID nil hvis false"
  []
  (when false
    (println "Denne printes")
    "og denne outputtes, hvis when er true"))

(defn or-exampel1
  "Or returns either the first truthy value or the last value"
  []
  (or false nil "en string er anset som true"))

(defn or-exampel2 []
  (or false nil))

(defn and-exampel1
  "AND returns the first FALSEY value, or the last value"
  []
  (and true "en string er anset som true" false nil))

(defn and-exampel2 []
  (and true "en string er anset som true"))

(defn combineStrings "str funktionen"
  []
  (str "Lord" " " "Voldemort"))

(defn mapOpslag "get funktionen"
  [navntypen]
  (get {:fornavn "Taylor" :efternavn "Swift" } navntypen))

(defn mapOpslag-withDefaultValue "get funktionen med default
  (Prøv at slå key'en :kælenavn op
   (denne key findes ikke, derfor retunes default valueen -> Bæverdrengen))"
  [navntypen]
  (get {:fornavn "Justin" :efternavn "Bieber"} navntypen "Bæver-drengen"))

(defn nestedeMapOpslag "get-in funktionen"
  []
  (get-in {:husfarve {:Huffelpuf "gul" :Ravenclaw "blå"}} [:husfarve :Ravenclaw]))

(defn vectorOpslag "get funktionen"
  []
  (get [1 2 3 "Abe" {:Kanin "Nini"}] 0)
  #_" Husk! Vectore er 0-indexserede")

(defn opretVector "vector functionen"
  []
  (vector "The Knights who says NI" 1 "Shrubbery"))

(defn tilfoejTilVector "conj funktionen
                        Det tilføjede bliver indsat TILSIDST i vectoren"
  []
  (conj ["What is your favorite color?" :blue false] "but it is blueeeee"))

(defn listOpslag "nth funktionen
                  I en liste kan man ikke bruge ''get'' til opslag!
                  NOTE det er hurtigere at lave opslag på en vector!"
                  #_" Husk! lister er 0-indexserede"
  []
  (nth '(1 2 3) 1))

(defn opretListe "list funktionen"
  []
  (list 1 "to" 3 "og" 4))

(defn tilfoejTilListe "conj funktionen
                       Det tilføjede bliver indsat FØRST i list"
  []
  (conj '("er det klogeste ord") "Hakunamatata"))


