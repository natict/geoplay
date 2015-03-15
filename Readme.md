# Readme #

For working with GeoPlay you'll need an ElasticSearch cluster (you can start with one server),
and a HTTP server to store and serve your streams from (we used Apache).
Here is a quick guide that will help you to setup a basic configuration:

1. Installing ElasticSearch server
> Download ElasticSearch from: http://www.elasticsearch.org/download/2011/08/13/0.17.6.html
> Follow the instructions in: http://www.elasticsearch.org/guide/reference/setup/installation.html
> and: http://www.elasticsearch.org/guide/reference/setup/configuration.html

> In elasticsearch.yml, please set the following values:
> > cluster.name: geoplay
> > network.host: 0.0.0.0


> You may set other options for demonizing the server and tweaking it to your machine.

2. Setting up the Elastic search index
> Send a PUT request to setup the index. If you are using linux you may run:

curl -XPUT 'http://192.168.1.107:9200/geoplay/loc/_mapping' -d '
{
> "loc" : {
> > "properties" : {

> "name" : { "type" : "string", "index" : "analyzed" },
> "stream": { "type" : "string", "index" : "analyzed" },
> "location" : { "type" : "geo\_point" }
> > }
> > }
}'

3. Installing Apache server

> From a linux commandline (ubuntu), simply type:

sudo apt-get install apache2

4. Setting up the Apache server
> You may now put your mp3 files under /var/www
> Make sure to give read permission to the httpd user. If you are not sure, just use:

chmod a+x /var/www/your\_stream.mp3