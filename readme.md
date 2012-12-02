# EuroMirror #

**EuroMirror** is a discontinued Android/web app for reading news on EU countries written by other member states media. It got the second place at Generation 1992 (app category), a EU contest for we people who were born the same year [Maastricht Treaty](http://en.wikipedia.org/wiki/Maastricht_Treaty) was signed.

[![](http://www.android.com/images/brand/android_app_on_play_logo_large.png)](https://play.google.com/store/apps/details?id=eu.euromirror)

This very simple app uses Android 2.1 SDK, and it's mostly based on HTML, CSS and Javascript (displayed on webview). The CSV output of [this Google Spreadsheet](https://docs.google.com/spreadsheet/ccc?key=0Ai5im0N8JkIDdDNpZ1l4VVFSb2tqaHFtNk9nZG41UkE) is turned thanks to some PHP into nice, light JSON (see `/json`). An awesome jQuery plugin called [JSON 2 HTML](http://json2html.com/) does the rest.

The files inside `/assets` would work also on mobile browsers like iPhone Safari.

## Known issues ##

I'm not a JS or Android expert —at all, so there are some issues that couldn't be solved:

- Make links respond faster on hover/click on loaded news.
- Make anchor tags like `market://` or `mailto:` work properly.

## Who is behind this? ##

I'm [Juan Ruitiña](http://juanruitina.com/en), a Journalism student from Spain. You can send me a mail to [eum@juanruitina.com](mailto:eum@juanruitina.com) or [follow me](http://twitter.com/juanruitina) on Twitter (I tweet mostly in Spanish).

## License ##

Both the code and the spreadsheet content are under a [Creative Commons BY-SA](http://creativecommons.org/licenses/by-sa/3.0/deed.en) license, so feel free to copy and redistribute —but please, don't forget to mention.