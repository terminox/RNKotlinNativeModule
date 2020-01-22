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
  return (
    <NativeView style={{ flex: 1 }} />  
  );
};

export default App;
