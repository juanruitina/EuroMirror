# EuroMirror #

**EuroMirror** is a free Android app for reading news on EU countries written by other member states media (only in English, at the moment). It has been developed for a EU contest, Generation 1992, for we people who were born the same year [Maastricht Treaty](http://en.wikipedia.org/wiki/Maastricht_Treaty) was signed.

[![](http://www.android.com/images/brand/android_app_on_play_logo_large.png)](https://play.google.com/store/apps/details?id=eu.euromirror)

This very simple app uses Android 2.1 SDK, and it's mostly based on HTML, CSS and Javascript (displayed on webview). A Google spreadsheet CSV output is turned thanks to some PHP [like this](https://gist.github.com/2508837) (thanks to Rob Flaherty & Ændrew Rininsland) into nice, light JSON. An awesome jQuery plugin called [JSON 2 HTML](http://json2html.com/) does the rest.

The files inside `/assets` would work also on mobile browsers like iPhone Safari.

## To-dos ##

I'm not a JS or Android expert —at all, so there are some issues I couldn't address yet. Any help on this stuff would be greatly appreciated:

- Make links respond faster on hover/click on loaded news.
- Make anchor tags like `market://` or `mailto:` work properly.

## Who is behind this? ##

I'm [Juan Ruitiña](http://juanruitina.com), a Journalism student from Spain. You can send me a mail to [eum@juanruitina.com](mailto:eum@juanruitina.com) or [follow me](http://twitter.com/juanruitina) on Twitter (I tweet mostly in Spanish).

## License ##

Both the code and the spreadsheet content are under a [Creative Commons BY-SA](http://creativecommons.org/licenses/by-sa/3.0/deed.en) license, so feel free to copy and redistribute —but please, don't forget to mention.