def call(String ImageName, String ImageTag){
  echo 'Image build started'
  sh "docker build -t ${ImageName}:${ImageTag} ."
  echo 'Image build successful'
}
