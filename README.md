[![Build Status](https://travis-ci.org/mvysny/vaadin-kotlin-pwa.svg?branch=master)](https://travis-ci.org/mvysny/vaadin-kotlin-pwa)

# Vaadin Kotlin PWA Demo

A very simple Vaadin-based PWA demo with no JavaScript code whatsoever. Tailored towards Android developers who want to
use familiar strongly-typed language and don't feel at home with all that JavaScript stuff. Don't worry -
we will avoid the browser as much as we can.

### What's PWA

Progressive Web App is a web page that the mobile phone browser can download and it can then work offline, to a certain degree.
Since we're going to implement the logic server-side
to avoid JavaScript, offline mode obviously won't work. So we'll make the app progressive enough - we'll
include all necessary things like the `manifest.json` and service workers, but they'll just show
the "You're offline" page when offline.

The PWAs also tend to adapt to the screen size (so-called Responsiveness), typically with a CSS rules.
You can check out what PWAs are, at [Vaadin Progressive Web Apps](https://vaadin.com/pwa).

The PWA-related files are registered in the [CustomBootstrapListener](src/main/kotlin/com/vaadin/pwademo/Bootstrap.kt).

### The UI Components

Now that the PWA thing is sorted out, let's construct the app UI. Vaadin framework is component-oriented,
which makes it feel familiar to Android developers (since Views are also components). Generally you nest your Buttons into a
lot of Vertical/HorizontalLayouts, but without the pain Android development typically brings.

* No Fragments - no crazy lifecycle of create/start/resume/whatever. The app simply always runs; the components attach and detach
  as you use the app. All UI components are Serializable and automatically saved to a http session when there are no requests ongoing.
* Components are the unit of reuse - you compose components into more powerful components, or into views.
* You use Kotlin DSL to build your UIs. You structure the code as you see fit, no need to have 123213 layout XMLs for 45 screen sizes.
* You use CSS to style your app - you don't have to analyze Android Theme split into 3214132 XML files.
* You don't need Emulator nor a device - the browser can render the page as if in a mobile phone; you can switch
  between various resolutions in an instant.
* No DEX compilation. The compilation is fast.

The [MainView.kt](src/main/kotlin/com/vaadin/pwademo/MainView.kt) hosts the main view of the app. It uses the Karibu-DSL library to define UIs;
you can read more about the [Karibu-DSL](https://github.com/mvysny/karibu-dsl). 

To quickly run the app, just run the following from your terminal:

```bash
$ ./gradlew appRun
```

Your app will be running on [http://localhost:8080](http://localhost:8080).

### Live Demo

[Vaadin Kotlin PWA](https://vaadin-kotlin-pwa.herokuapp.com/) running on Heroku.

### Develop with pleasure

You can download and install the Intellij IDEA Community Edition, then import this project into it. Android Studio is based on Intellij IDEA Community,
so you should feel immediately at home.

To launch this app, just click on the right Gradle tab, then select `Tasks / gretty / appRun`. Right-click on appRun and select Debug:
the app will start soon in a Jetty server. Just open your browser and hit [http://localhost:8080](http://localhost:8080).

The main meat of the UI is located in the [MainView.kt](src/main/kotlin/com/vaadin/pwademo/MainView.kt) - feel free to edit that file
and experiment for yourself. There are lots of pre-existing Vaadin components; you can check out the
[Beverage Buddy](https://github.com/mvysny/karibu-dsl#gradle-quickstart-application-vaadin-10flow) example app for more
examples of component usage.

The browser is a very powerful IDE. Take your time and read slowly through the following tutorials, to get acquinted with the browser
developer tools:

* [Chrome Developer Tools tutorial](https://developers.google.com/web/tools/chrome-devtools/)
* [Firefox Developer Tools tutorial](https://developer.mozilla.org/en-US/docs/Tools)
