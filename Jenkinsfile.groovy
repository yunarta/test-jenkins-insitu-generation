def call() {
    if (BRANCH_NAME == "master") {
        pipeline = load 'SequenceA.groovy'
        pipeline(this)
    } else {
        pipeline = load 'SequenceB.groovy'
        pipeline(this)
    }
}

call()

