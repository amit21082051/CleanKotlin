# Clean Kotlin

Goals:

  - Develop a Kotlin android app from scratch
  - Apply uncle's bob clean architecture to an android app
  - Isolate layers of clean architecture (presentation, domain, data) in independant android-libraries
  - Use MVP with a Router/Navigator in the presentation layer
  - Include elements from another clean based architectures such as VIPER 

# What the hell is Clean Architecture?

<p align="center">
<img src="https://github.com/elabi3/CleanArchitecture/blob/master/architecture-layers.png" height="600">
</p>

# What libraries i use to do that?

| Presentation |     Domain   |     Data     |
| ------------ | ------------ | ------------ |
| RxJava | RxJava | RxJava |
| RxAndroid | | RxAdapter |
| Material Snackbar | | OkHttp |
| Material Dialogs | | Retrofit |
| Glide | | Gson |
      
# References

To develop this example app i read multiple articles that inspire to me:

  - [The clean architecture](https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html)
  - [Architecting Android...The clean way?](https://fernandocejas.com/2014/09/03/architecting-android-the-clean-way/)
  - [Architecting Android...The evolution](https://fernandocejas.com/2015/07/18/architecting-android-the-evolution/)
  - [Architecture Components](https://developer.android.com/topic/libraries/architecture/guide.html)
  - [Applying clean architecture on Android](http://five.agency/android-architecture-part-3-applying-clean-architecture-android/)
  - [Using the VIPER architecture on Android](https://cheesecakelabs.com/blog/using-viper-architecture-android/)
  
Extra:

  - [Advocating Against Android Fragments](https://medium.com/square-corner-blog/advocating-against-android-fragments-81fd0b462c97)
  - [THE EVOLUTION OF ANDROID ARCHITECTURE](http://zserge.com/blog/android-mvp-mvvm-redux-history.html)
  
# Author

Abimael Barea [@elabi3](https://github.com/elabi3)
