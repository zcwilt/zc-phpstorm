package com.github.zcwilt.zcphpstorm.services

import com.intellij.openapi.project.Project
import com.github.zcwilt.zcphpstorm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
