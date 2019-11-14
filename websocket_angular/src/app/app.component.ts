import { Component } from '@angular/core';
import { WebSocketAPI } from './WebSocketAPI';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'websocket';

  registration=true;

  webSocketAPI: WebSocketAPI;

  greeting: any;
  name :String;

  ngOnInit(){
    this.webSocketAPI=new WebSocketAPI(new AppComponent);
  }

  connect(value:any){
    this.registration=false;
    this.webSocketAPI.register(value);
  }

  disconnect(){
    this.webSocketAPI._disconnect();
  }

  sendMessage(value:any){
    this.webSocketAPI._send(value);
  }

  handleMessage(message){
    this.greeting = message;
  }

}
