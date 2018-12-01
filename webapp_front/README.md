# Express Boilerplate
A minimal Express.js app serving single-page html, css, and javascript files.
___

## Goals:
&nbsp;&nbsp; 1. To fasten and simplify the deployment of vanilla js apps to heroku;\
&nbsp;&nbsp; 2. Make the first step towards automation of the deployment process;\
&nbsp;&nbsp; 3. An intro to npm scripting;

## Usage:
&nbsp;&nbsp; 1. Once in the new project's parent folder:
```shell
 git clone https://github.com/MaciejReimann/ExpressBoilerplate.git
```
&nbsp;&nbsp; 2. Rename the freshly created folder from `ExpressBoilerplate` into `TestProject`;\
<br>
&nbsp;&nbsp; 3. Once in the TestProject folder, change project's remote repo: <br> 
```shell
 git remote set-url origin https://github.com/YourRepos/TestProject.git
```
&nbsp;&nbsp; 4. Optionally, make sure `http://localhost:8080` is free and
```shell
 npm run locally
```
&nbsp;&nbsp; to run it locally :)

&nbsp;&nbsp; 5. create a new heroku app for the project: 
```shell
heroku create test-project
```
&nbsp;&nbsp; 6. Push your project to heroku: 
```shell
git push heroku master
```
&nbsp;&nbsp; 7. See your project live: `heroku open`;\
<br>
&nbsp;&nbsp; 8. Don't forget to fill your project's `FILLME.md` and make it a `README.md` with relevant content! \
<br>
&nbsp;&nbsp; 9. After every significant update, commit all changes so that if you `git status`, you'll get:
```shell
On branch master
Your branch is up to date with 'origin/master'.
```
&nbsp;&nbsp;&nbsp; and then:
```shell
npm run publish
```
&nbsp;&nbsp;&nbsp; to see it live in a new window.
<br>

## Useful Resources:
