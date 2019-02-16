type=$1
pid=$2
execution_idx=$3
application=$4
class=$5

if [ "$type" != "no" ]; then
seed_clone=$6
fi
# if [ "$type" = "model" ]; then
#
# elif [[ "$type" = "test" ]]; then
#
# else
#
# fi

while kill -0 "$pid"; do
            sleep 1
done

if [ "$type" != "no" ]; then
  python python/write_on_csv_file.py $type $execution_idx $application $class $seed_clone &
else
  python python/write_on_csv_file.py $type $execution_idx $application $class &
fi
