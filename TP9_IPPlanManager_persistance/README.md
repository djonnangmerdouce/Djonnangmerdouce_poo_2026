 TP 9 PERSISTANCE ET ORGANISATION PROFESSIONNELLE
18. Réponses aux questions de compréhension
1.Qu'est-ce que la persistance des données ?
La persistance signifie que les données produites par l'application sont enregistrées sur un support durable (comme un fichier texte, CSV ou une base de données) afin qu'elles ne disparaissent pas à l'arrêt du programme.  
2.Pourquoi une application professionnelle doit-elle sauvegarder ses résultats ?
Dans une application réelle, un plan d'adressage doit pouvoir être conservé pour être relu plus tard, exploité dans un rapport technique ou partagé avec une équipe. 
3. Quelle est la différence entre un fichier CSV et un rapport texte ?
Le fichier CSV est un format structuré (utilisant souvent le point-virgule comme séparateur) destiné à être lu par d'autres programmes ou tableurs. Le rapport texte est un document formaté destiné à être lu directement par un humain, comme un administrateur ou un enseignant.  Pourquoi a-t-on créé un package repository ?
Le package repository contient les classes chargées spécifiquement de l'accès aux données (lecture et écriture de fichiers dans ce TP), séparant ainsi le stockage de la logique métier.  
5.Pourquoi a-t-on créé un package service ?
Le package service regroupe les classes qui réalisent des traitements et des transformations de données (comme le calcul VLSM ou la génération de rapports).  Pourquoi ne faut-il pas écrire tout le code dans la classe Main ?
Écrire tout le code dans Main rend l'application difficile à maintenir. La séparation des responsabilités entre différentes classes et packages rend le projet plus propre et évolutif.
7.  Pourquoi le fichier besoins.csv rend-il l'application plus flexible ?
Il permet de modifier les exigences du réseau (noms, nombre d'hôtes) sans avoir à modifier et recompiler le code source Java de l'application. 
8. Pourquoi la séparation en packages améliore-t-elle la maintenabilité du projet ?
Cette organisation professionnelle permet de ne pas mélanger les responsabilités techniques. On sait exactement où trouver le code lié aux données (model), aux calculs (service) ou au stockage (repository).  
