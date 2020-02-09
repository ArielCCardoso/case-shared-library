def call(args) {

  def dir = "${WORKSPACE}"
  def slave = "${SLAVE_BUILD}"
  def manifest = "${WORKSPACE}/${MANIFEST_PATH}"
  def image = sh(script: "cat image_version", returnStdout: true).trim() as String

  steps.container("${slave}"){
    steps.dir("${dir}"){
      args.steps.sh(script: "sed -i 's/image_version/${image}/g' ${manifest}", returnStdout:true).trim()
    }
  }
}
