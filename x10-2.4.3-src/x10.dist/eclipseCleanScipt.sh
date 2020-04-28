#!/bin/bash
#squeaky clean the distribuition
ant squeakyclean 
#this deletes the temporary files created in /temp in x10.dist
echo "deleting tmp files"
find /tmp -name 'x10c-*' -exec echo {} \;
find /tmp -name 'x10c-*' -exec  rm -rf {} \;
#this deletes all the out files created after compilation and running
echo "deleting out files "
find ~/workspace  -name 'out' -exec echo {} \;
find ~/workspace/.  -name 'out' -exec rm -rf {} \;
