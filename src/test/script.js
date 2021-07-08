
import http from 'k6/http';
import { sleep } from 'k6';


export let options = {
  vus: 10,
  duration: '30s',
};

export default function () {

 // --vus 10 --duration 30s
  http.post('https://www.betway.co.za/');
  sleep(1);
  //opt

}
https://www.betway.co.za/
export let options = {
  ext: {
    loadimpact: {
      projectID: 3538437,
      // Test runs with the same name groups test runs together
      name: "YOUR TEST NAME"
    }
  }
}
