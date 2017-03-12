# play-scala-baas.g8
giter8 template for a Scala Play project as a Mobile backend as a service (MBaaS)

### Quick Start
Generate a new project using [giter8](https://github.com/foundweekends/giter8) or sbt 0.13.13(or higher)
```
# install giter8
brew update && brew install giter8

# testing templates locally
git clone git@github.com:makersu/play-scala-baas.g8.git
sbt new file://play-scala-baas.g8

# create new build definitions from the template on github
sbt new makersu/play-scala-baas.g8
cd play-scala-baas
sbt run

# run with docker
sbt docker:publishLocal
docker run -it -p 9000:9000 play-scala-baas:1.0-SNAPSHOT
```


### [Wiki](https://github.com/makersu/playback-scala.g8/wiki)
