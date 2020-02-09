def call(args) {

  def dir = "${WORKSPACE}"
  def slave = "${SLAVE_DEPLOY}"
  def manifest = "${WORKSPACE}/${MANIFEST_PATH}"

  steps.container("${slave}"){
    steps.dir("${dir}"){
      args.steps.sh(script: "kubectl apply -f ${manifest}", returnStdout:true).trim()
    }
  }
}