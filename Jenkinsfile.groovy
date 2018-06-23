def call() {
    if (BRANCH_NAME == "master") {
        load 'SequenceA.groovy'
    } else {
        load 'SequenceB.groovy'
    }
}

call()

