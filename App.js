/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  StatusBar,
  requireNativeComponent,
  Platform
} from 'react-native';

const NativeView = Platform.select({
  ios: View,
  android: requireNativeComponent('RNLineChartView')
})

const App: () => React$Node = () => {
  const data = [
    {
      "x": "2019-01-01T00:00:00.000Z",
      "y": 9.128577076454953
    },
    {
      "x": "2019-01-02T00:00:00.000Z",
      "y": 9.621677447036285
    },
    {
      "x": "2019-01-03T00:00:00.000Z",
      "y": 9.800898306097011
    },
    {
      "x": "2019-01-04T00:00:00.000Z",
      "y": 10.239303006206542
    },
    {
      "x": "2019-01-05T00:00:00.000Z",
      "y": 9.263790454893815
    },
    {
      "x": "2019-01-06T00:00:00.000Z",
      "y": 10.723683329411156
    },
    {
      "x": "2019-01-07T00:00:00.000Z",
      "y": 9.260545342010303
    },
    {
      "x": "2019-01-08T00:00:00.000Z",
      "y": 10.530510539531502
    },
    {
      "x": "2019-01-09T00:00:00.000Z",
      "y": 10.235300300325429
    },
    {
      "x": "2019-01-10T00:00:00.000Z",
      "y": 10.555879793788444
    }
  ]

  return (
    <View style={{ flex: 1 }}>
      <View style={{ flex: 0.4 }}>
        <NativeView style={{ flex: 1 }} data={data} />
      </View>
    </View>
  );
};

export default App;
