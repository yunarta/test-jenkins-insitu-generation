def call() {
    switch (BRANCH_NAME) {
        case { it == "master" }:
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
            break

        case { it == "develop" }:
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
            break
    }
}

call()

