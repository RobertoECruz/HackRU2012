public static String lookUpChannel(int ch, String[] nets, int[] chans){
// need 3 arguments
// 3 arguments are:
// int ch 1) number of channel you want
// String[] nets: network associated with channel
// int[] chans: array of channels
// if you want to read into array: int c == arr[2]
// or: arr[3] = -1
// 
int lengthofarraychans = nets.length;
  for(int i = 0; i < lengthofarraychans; i++){
    if(int[i] == nets){
      return nets[i];
    }
    return "not a channel part of any network";
  }
}
//first attempt

int index = -1;

for(int i = 0; i < chan.length; i++){

  if(ch = chan[i])
    index = i;
}

if (index != -1)
  return nets[index];
else
  return "Channel not found.";
//TODO: do the reverse, given network find channel
