<p align="center">
    <a href="https://www.gitignore.io">
        <img src="https://cdn.rawgit.com/joeblau/gitignore.io/master/Public/img/gitignoreio.svg" />
    </a>
    <br>
    <strong>Create useful .gitignore files for your project</strong>
</p>

# sbt-gitignore

An sbt plugin that adds commands for [gitignore.io](https://www.gitignore.io/) to create useful .gitignore files for your project.

## Usage

This plugin requires sbt 1.0.0+.

### Installation

You can enable the plugin in any given project by adding this into the `project/plugins.sbt` file:
```scala
addSbtPlugin("nz.co.bottech" % "sbt-gitignore" % "1.0.0")
```

To have it available in all your projects, add that line into the `~/.sbt/1.0/plugins/plugins.sbt` file.

### Tasks

#### List

To list all the available templates:
```sbtshell
> show gitIgnoreList
```
