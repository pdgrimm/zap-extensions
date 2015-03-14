# Zest - Scripting Security Tests #

Allows you to create and run scripts for reproducing security issues.

# Zest #

Zest is a specialized scripting language developed by the Mozilla security team and is intended to be used in web orientated security tools.

For more details see:
  * https://developer.mozilla.org/en-US/docs/Zest
  * https://github.com/mozilla/zest
  * http://groups.google.com/group/mozilla-zest

## The ZAP Zest Add-on ##

This add-on allows you to create, edit, and run Zest scripts.

Note that this add-on will not work with ZAP 2.0.0 - you must use at least ZAP 2.1.0.

It is alpha status, and currently has limited help - more will be added soon.

![![](http://zaproxy.googlecode.com/svn/wiki/images/Zest-BodgeIt-Register-XSS-zap-sm.jpg)](http://zaproxy.googlecode.com/svn/wiki/images/Zest-BodgeIt-Register-XSS-zap.jpg)


Some hints to help you get started:
  * Right click on requests in the Sites and History tab - there will be a right click option to add them to Zest scripts
  * Right click on nodes in the Zest Scripts tab - there will be options to add new nodes
  * If you select a node in the Zest Scripts tab then the original request and response will be shown in the relevant tabs. If you highlight strings in those tabs then there will be some Zest related options
  * If you run a script and select a request in the Zest Results tab then the request and response will be shown in the relevant tabs
  * If you right click a request in the Zest Results tab and have the 'diff' add-on installed then you will be able to compare the original response with the new one