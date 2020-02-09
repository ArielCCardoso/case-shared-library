def call(args) {

  def dir = "${WORKSPACE}"
  def slave = "${SLAVE_DEPLOY}"

  def image = def disk_size = sh(script: "cat image_version", returnStdout: true).trim() as String

  steps.container("${slave}"){
    steps.dir("${dir}"){
      args.steps.sh(script: "sed -i 's/image_version/$image/g' $dir/$manifest", returnStdout:true).trim()
    }
  }
}
