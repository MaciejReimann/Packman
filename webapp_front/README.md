# MERN Boilerplate
* Backend: NodeJS server with ExpressJS app connected to MongoDB via Mongoose; 
* Frontend: ReactJS;
___

## Goals:
&nbsp;&nbsp; To fasten and simplify the deployment of MERN apps to heroku;

## Usage:
&nbsp;&nbsp; 1. Once in the new project's parent folder:
```shell
 git clone https://github.com/MaciejReimann/MERNBoilerplate.git
```
&nbsp;&nbsp; 2. Rename the freshly created folder from `MERNBoilerplate` into `<TestProject>`;\
<br>
&nbsp;&nbsp; 3. Once in the TestProject folder, change project's remote repo: <br> 
```shell
 git remote set-url origin https://github.com/YourRepos/<TestProject>.git
```
&nbsp;&nbsp; 4. Go to [mLab](https://mlab.com/home), create a database and copy the MongoDB URI;
<br>
&nbsp;&nbsp; 5. To connect locally to Mongo, go to `server/config` and create a `keys_dev.js`:
```javascript
module.exports = {
    mongoURI: '<paste-your-mongoURI-here>'
};
```
&nbsp;&nbsp; 6. Run locally:
```shell
 npm run locally
```
&nbsp;&nbsp; 7. Create a new heroku app for the project:
```shell
heroku create <test-project>
```
&nbsp;&nbsp;&nbsp;&nbsp; Or, in case the app has been already deployed:
```shell
git remote add heroku https://git.heroku.com/<test-project>.git
```
&nbsp;&nbsp; 8. Push your project to heroku:
```shell
npm run publish
```
&nbsp;&nbsp; Meanwhile it's building your app: 
* go to: https://dashboard.heroku.com/apps/ and find your freshly-created app,
* go to `Setings > Config Vars` and fill in: \
&nbsp;&nbsp;`KEY: MONGO_URI` \
&nbsp;&nbsp;`VALUE: <paste-your-mongoURI-here>`

&nbsp;&nbsp; 9. Don't forget to fill your project's `FILLME.md` and make it a `README.md`!
<br>
&nbsp;&nbsp; 10. To publish your progress:
```shell
git add .
git commit -am "make it better"
npm run publish
```
## Useful Resources:
* [heroku-cra-node](https://github.com/mars/heroku-cra-node)
* [Heroku | Deploying with Git](https://devcenter.heroku.com/articles/git)
