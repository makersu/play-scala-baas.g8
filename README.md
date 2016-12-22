# playback-scala.g8
giter8 template for a Scala Play project as a Mobile backend as a service (MBaaS)

### Quick Start
Generate a new project using [giter8](https://github.com/foundweekends/giter8) or sbt 0.13.13(or higher)
```
# install giter8
$ brew update && brew install giter8

# sbt new makersu/playback-scala.g8
# g8 makersu/playback-scala.g8 --name=my-playback-scala
g8 makersu/playback-scala.g8 
cd playback-scala
sbt run

# run with docker
sbt docker:publishLocal 
docker run -it -p 9000:9000 playback-scala:1.0.0-SNAPSHOT
```


### [Wiki](https://github.com/makersu/playback-scala.g8/wiki)
