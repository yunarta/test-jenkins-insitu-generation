def call() {
    if (BRANCH_NAME == "master") {
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
    } else {
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
    }
}

call()

