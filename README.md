# Modyo Springboot Microservice Template

This template allows you to create a Modyo Microservice project with Spring Boot 2.7 using the hexagonal architecture.

## Setup:

### Create a repository from this template
1. Click the big green button `Use this template` at the top right of this page or click <a href="../../generate">here</a>.
2. Enter a Repository name and click `Create repository from template`.
3. Go to the created repository and complete the setup **&darr;**.

### Complete setup
1. In the new repository verify if workflows are allowed to write. Please go to Project Settings - Actions - General and in Workflow permissions give "Read and write permissions" to workflows.
1. Go back to the repository and <a href="../../edit/master/cookiecutter.json">complete the project setup</a> editing the `cookiecutter.json` file. 
1. Hit <kbd>cmd</kbd> + <kbd>S</kbd> and then <kbd>Enter</kbd> to perform a commit (the commit message doesn't matter).
1. Wait <a href="../../actions">Setup Repository Action</a> to complete.

:point_right: The newly created project depends on Modyo Commons Library so you must define two actions secrets (CI_GITHUB_TOKEN and CI_GITHUB_USERNAME) to allow Github actions to download it and build your project. Please set this up before your first PR.

:warning: After the action runs you can change the workflow permissions again, if you like.

That's it, your repository now contains a basic Spring Boot Microservice project.

