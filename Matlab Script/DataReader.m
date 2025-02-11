% Script by Markus Gulla

close all; clear; clc;
load n4.CSV
load n6.CSV
load n8.CSV

% assigning variables
n4OriginalArray = n4(:,1);
n4Merge = n4(:,2);
n4Heap = n4(:,3);
n4Quick = n4(:,4);
n4Shaker = n4(:,5);

n6OriginalArray = n6(:,1);
n6Merge = n6(:,2);
n6Heap = n6(:,3);
n6Quick = n6(:,4);
n6Shaker = n6(:,5);

n8OriginalArray = n8(:,1);
n8Merge = n8(:,2);
n8Heap = n8(:,3);
n8Quick = n8(:,4);
n8Shaker = n8(:,5);

% the 10 best and worst results for each test and their index
% also taking the average performance

% Merge Results
[n4MergeBest,n4MBIDX] = mink(n4Merge,10)
n4MergeAverage = (sum(n4Merge))/(length(n4Merge))
[n4MergeWorst,n4MWIDX] = maxk(n4Merge,10)

[n6MergeBest,n6MBIDX] = mink(n6Merge,10)
n6MergeAverage = (sum(n6Merge))/(length(n6Merge))
[n6MergeWorst,n6MWIDX] = maxk(n6Merge,10)

[n8MergeBest,n8MBIDX] = mink(n8Merge,10)
n8MergeAverage = (sum(n8Merge))/(length(n8Merge))
[n8MergeWorst,n8MWIDX] = maxk(n8Merge,10)


% Heap Results
[n4HeapBest,n4HBIDX] = mink(n4Heap,10)
n4HeapAverage = (sum(n4Heap))/(length(n4Heap))
[n4HeapWorst,n4HWIDX] = maxk(n4Heap,10)

[n6HeapBest,n6HBIDX] = mink(n6Heap,10)
n6HeapAverage = (sum(n6Heap))/(length(n6Heap))
[n6HeapWorst,n6HWIDX] = maxk(n6Heap,10)

[n8HeapBest,n8HBIDX] = mink(n8Heap,10)
n8HeapAverage = (sum(n8Heap))/(length(n8Heap))
[n8HeapWorst,n8HWIDX] = maxk(n8Heap,10)


% Quick Results
[n4QuickBest,n4QBIDX] = mink(n4Quick,10)
n4QuickAverage = (sum(n4Quick))/(length(n4Quick))
[n4QuickWorst,n4QWIDX] = maxk(n4Quick,10)

[n6QuickBest,n6QBIDX] = mink(n6Quick,10)
n6QuickAverage = (sum(n6Quick))/(length(n6Quick))
[n6QuickWorst,n6QWIDX] = maxk(n6Quick,10)

[n8QuickBest,n8QBIDX] = mink(n8Quick,10)
n8QuickAverage = (sum(n8Quick))/(length(n8Quick))
[n8QuickWorst,n8QWIDX] = maxk(n8Quick,10)


% Shaker Results
[n4ShakerBest,n4SBIDX ] = mink(n4Shaker,10)
n4ShakerAverage = (sum(n4Shaker))/(length(n4Shaker))
[n4ShakerWorst,n4SWIDX ] = maxk(n4Shaker,10)

[n6ShakerBest,n6SBIDX] = mink(n6Shaker,10)
n6ShakerAverage = (sum(n6Shaker))/(length(n6Shaker))
[n6ShakerWorst,n6SWIDX] = maxk(n6Shaker,10)

[n8ShakerBest,n8SBIDX] = mink(n8Shaker,10)
n8ShakerAverage = (sum(n8Shaker))/(length(n8Shaker))
[n8ShakerWorst,n8SWIDX] = maxk(n8Shaker,10)
