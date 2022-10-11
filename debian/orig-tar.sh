#!/bin/sh -e

# called by uscan with '--upstream-version' <version> <file>

TAR=../libswingx-java_$2.orig.tar.gz
DIR=swingx-$2-sources

# clean up and repackage the upstream zip file
unzip $3
tar -c -z -f $TAR -X debian/orig-tar.exclude $DIR
rm -rf $DIR $3

# move to directory 'tarballs'
if [ -r .svn/deb-layout ]; then
  . .svn/deb-layout
  mv $TAR $origDir
  echo "moved $TAR to $origDir"
fi

exit 0
