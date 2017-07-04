# Clean Kotlin

Goals:

  - Develop a Kotlin android app from scratch
  - Apply uncle's bob clean architecture to an android app
  - Isolate the layers of clean architecture (presentation, domain, data) in independant android-libraries
  - Learn about MPV using it in the presentation layer
  - Evaluate differences and similitudes with another clean based architectures such as VIPER 

# What the hell is Clean Architecture?

<p align="center">
<img src="https://github.com/elabi3/CleanArchitecture/blob/master/architecture-layers.png" height="600">
</p>

# What libraries i use to do that?

<p align="center">

| Presentation |     Domain   |     Data     |
| ------------ | ------------ | ------------ |
| RxJava | RxJava | RxJava |
| RxAndroid | | RxAdapter |
| Material Snackbar | | OkHttp |
| Material Dialogs | | Retrofit |
| Glide | | Gson |

</p>
      
# References

To develop this example app i read multiple articles that inspire to me:

  - The clean architecture https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html
  - Architecting Android...The clean way? https://fernandocejas.com/2014/09/03/architecting-android-the-clean-way/
  - Architecting Android...The evolution https://fernandocejas.com/2015/07/18/architecting-android-the-evolution/
  - Architecture Components https://developer.android.com/topic/libraries/architecture/guide.html 
  - http://five.agency/android-architecture-part-3-applying-clean-architecture-android/
  - https://cheesecakelabs.com/blog/using-viper-architecture-android/
  
Extra:

  - https://medium.com/square-corner-blog/advocating-against-android-fragments-81fd0b462c97
  - http://zserge.com/blog/android-mvp-mvvm-redux-history.html
  
# Author

Abimael Barea [@elabi3](https://github.com/elabi3)
