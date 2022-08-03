plugins {
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.0.18"
}

rootProject.name = "test-semantic"
include("app")

gitHooks {
    commitMsg { conventionalCommits() }
    createHooks()
}
