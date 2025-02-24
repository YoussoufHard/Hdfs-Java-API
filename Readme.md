# Manipulation du HDFS avec l'API Java

## 📋 Description
Ce projet illustre la manipulation du **HDFS** (*Hadoop Distributed File System*) à l'aide de l'**API Java**. L'application développée permet de créer et écrire un fichier sur le HDFS en se connectant au **NameNode**. Elle est construite avec **Java 8**, version compatible avec **Hadoop 3.3.6**.

## ⚙️ Prérequis
- **Java 8** (compatible avec Hadoop 3.3.6)
- **Hadoop 3.3.6**
- **IntelliJ IDEA**
- **Docker Desktop** (pour exécuter Hadoop via des conteneurs)

## 🚀 Étapes d'exécution

### 1️⃣ Cloner le projet
```bash
git clone <URL_DU_REPO>
cd <nom_du_projet>
```

### 2️⃣ Construire le fichier JAR
1. Ouvrir le projet dans **IntelliJ IDEA**.
2. Configurer le SDK Java en version **1.8**.
3. Générer le **fichier JAR** :
    - **File** ➔ **Project Structure** ➔ **Artifacts** ➔ **+ JAR From modules**.
    - Sélectionner la classe contenant la méthode `main`.
    - Construire l'artifact via **Build ➔ Build Artifacts**.

### 3️⃣ Démarrer Hadoop avec Docker
Assurez-vous que le **NameNode** est actif dans **Docker Desktop**.

### 4️⃣ Exécuter le fichier JAR sur le NameNode . A noter que le NameNode avec ses dataNode doive etre lancé au prealable dans docker desktop ou autre 
```bash
docker exec -it <container_namenode> bash
java -jar /chemin/vers/le/fichier.jar
```

### 5️⃣ Vérifier la création du fichier sur HDFS
- Lister le contenu du répertoire cible :
  ```bash
  hdfs dfs -ls /chemin/du/répertoire
  ```

- Lire le contenu du fichier créé :
  ```bash
  hdfs dfs -cat /chemin/du/répertoire/file1.txt
  ```

## 📁 Fonctionnalités
- Connexion au HDFS.
- Création d'un fichier sur HDFS.
- Écriture de contenu dans le fichier.

## 📜 Exemple de sortie
Après exécution, le contenu du fichier **file1.txt** sera :
```txt
Bonjour
Tout le monde
Fin du fichier
```

## 🤝 Auteurs
- **TANGARA YOUSSOUF**

## 📝 Licence
Ce projet est sous licence **MIT**

