pipeline {
    agent {
        node {
            label "java"
        }
    }

    stages {
        stage("Master") {
            steps {
                echo "master branch"
            }
        }
    }
}