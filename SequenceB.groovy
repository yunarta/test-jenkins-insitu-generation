pipeline {
    agent {
        node {
            label "java"
        }
    }

    stages {
        stage("Develop") {
            steps {
                echo "develop branch"
            }
        }
    }
}
