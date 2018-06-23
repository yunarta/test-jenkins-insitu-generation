def call() {
    if (BRANCH_NAME == "master") {
        pipeline = load 'SequenceA.groovy'
        pipeline()
    } else {
        pipeline = load 'SequenceB.groovy'
        pipeline()
    }
}

call()

