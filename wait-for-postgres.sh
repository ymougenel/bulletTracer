#!/bin/bash
# wait-for-postgres.sh

set -e
host="$1"
shift
cmd="$@"

#until psql -h "$host" -U "postgres" -c '\l'; do
 # >&2 echo "Postgres is unavailable - sleeping"
  #sleep 1
#done
#TODO wait for db, instead of a magic sleep value (cf doc)
sleep 15

>&2 echo "Postgres is up - executing command"
exec $cmd
