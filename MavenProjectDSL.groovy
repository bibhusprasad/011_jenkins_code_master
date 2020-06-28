job('First-Maven-Project-Via-DSL'){
    description("First Maven job generated by DSL on ${new date()}, the project is a small Maven project hosted on github")
    scm {
        git("git@github.com:bibhusprasad/012_jenkins_code_master.git", master)
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}