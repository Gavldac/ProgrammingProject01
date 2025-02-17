% Script by Markus Gulla

close all; clear; clc;
load n4.CSV
load n6.CSV
load n8.CSV

% assigning variables

c0 = linspace(1,10,10);

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
[n4MergeBest,n4MBIDX] = mink(n4Merge,10);
n4MergeAverage = (sum(n4Merge))/(length(n4Merge));
[n4MergeWorst,n4MWIDX] = maxk(n4Merge,10);

[n6MergeBest,n6MBIDX] = mink(n6Merge,10);
n6MergeAverage = (sum(n6Merge))/(length(n6Merge));
[n6MergeWorst,n6MWIDX] = maxk(n6Merge,10);

[n8MergeBest,n8MBIDX] = mink(n8Merge,10);
n8MergeAverage = (sum(n8Merge))/(length(n8Merge));
[n8MergeWorst,n8MWIDX] = maxk(n8Merge,10);


% Heap Results
[n4HeapBest,n4HBIDX] = mink(n4Heap,10);
n4HeapAverage = (sum(n4Heap))/(length(n4Heap));
[n4HeapWorst,n4HWIDX] = maxk(n4Heap,10);

[n6HeapBest,n6HBIDX] = mink(n6Heap,10);
n6HeapAverage = (sum(n6Heap))/(length(n6Heap));
[n6HeapWorst,n6HWIDX] = maxk(n6Heap,10);

[n8HeapBest,n8HBIDX] = mink(n8Heap,10);
n8HeapAverage = (sum(n8Heap))/(length(n8Heap));
[n8HeapWorst,n8HWIDX] = maxk(n8Heap,10);


% Quick Results
[n4QuickBest,n4QBIDX] = mink(n4Quick,10);
n4QuickAverage = (sum(n4Quick))/(length(n4Quick));
[n4QuickWorst,n4QWIDX] = maxk(n4Quick,10);

[n6QuickBest,n6QBIDX] = mink(n6Quick,10);
n6QuickAverage = (sum(n6Quick))/(length(n6Quick));
[n6QuickWorst,n6QWIDX] = maxk(n6Quick,10);

[n8QuickBest,n8QBIDX] = mink(n8Quick,10);
n8QuickAverage = (sum(n8Quick))/(length(n8Quick));
[n8QuickWorst,n8QWIDX] = maxk(n8Quick,10);


% Shaker Results
[n4ShakerBest,n4SBIDX ] = mink(n4Shaker,10);
n4ShakerAverage = (sum(n4Shaker))/(length(n4Shaker));
[n4ShakerWorst,n4SWIDX ] = maxk(n4Shaker,10);

[n6ShakerBest,n6SBIDX] = mink(n6Shaker,10);
n6ShakerAverage = (sum(n6Shaker))/(length(n6Shaker));
[n6ShakerWorst,n6SWIDX] = maxk(n6Shaker,10);

[n8ShakerBest,n8SBIDX] = mink(n8Shaker,10);
n8ShakerAverage = (sum(n8Shaker))/(length(n8Shaker));
[n8ShakerWorst,n8SWIDX] = maxk(n8Shaker,10);

% Best and Worst 10 Average
n4MBAVG = (sum(n4MergeBest))/(length(n4MergeBest));
n4MWAVG = (sum(n4MergeWorst))/(length(n4MergeWorst));
n4HBAVG = (sum(n4HeapBest))/(length(n4HeapBest));
n4HWAVG = (sum(n4HeapWorst))/(length(n4HeapWorst));
n4QBAVG = (sum(n4QuickBest))/(length(n4QuickBest));
n4QWAVG = (sum(n4QuickWorst))/(length(n4QuickWorst));
n4SBAVG = (sum(n4ShakerBest))/(length(n4ShakerBest));
n4SWAVG = (sum(n4ShakerWorst))/(length(n4ShakerWorst));

n6MBAVG = (sum(n6MergeBest))/(length(n6MergeBest));
n6MWAVG = (sum(n6MergeWorst))/(length(n6MergeWorst));
n6HBAVG = (sum(n6HeapBest))/(length(n6HeapBest));
n6HWAVG = (sum(n6HeapWorst))/(length(n6HeapWorst));
n6QBAVG = (sum(n6QuickBest))/(length(n6QuickBest));
n6QWAVG = (sum(n6QuickWorst))/(length(n6QuickWorst));
n6SBAVG = (sum(n6ShakerBest))/(length(n6ShakerBest));
n6SWAVG = (sum(n6ShakerWorst))/(length(n6ShakerWorst));

n8MBAVG = (sum(n8MergeBest))/(length(n8MergeBest));
n8MWAVG = (sum(n8MergeWorst))/(length(n8MergeWorst));
n8HBAVG = (sum(n8HeapBest))/(length(n8HeapBest));
n8HWAVG = (sum(n8HeapWorst))/(length(n8HeapWorst));
n8QBAVG = (sum(n8QuickBest))/(length(n8QuickBest));
n8QWAVG = (sum(n8QuickWorst))/(length(n8QuickWorst));
n8SBAVG = (sum(n8ShakerBest))/(length(n8ShakerBest));
n8SWAVG = (sum(n8ShakerWorst))/(length(n8ShakerWorst));

% Graphing

figure(1); % comparisons vs n
subplot(2,2,1); % 2 by 2 graphs on same page, first of 4 graphs follows
plot(c0,c0.^2, c0, c0.*log(c0),c0,c0,4,n4MBAVG,'go',4,n4MWAVG,'go',4,n4MergeAverage,'go',6, ...
    n6MBAVG,'ro',6,n6MWAVG,'ro',6,n6MergeAverage,'ro', ...
    8,n8MBAVG,'bo',8,n8MWAVG,'bo',8,n8MergeAverage,'bo'), grid; 
ylim([0,70]);
xlabel('Array Size');
ylabel('Comparisons');
title('Merge');

subplot(2,2,2); 
plot(c0,c0.^2, c0, c0.*log(c0),c0,c0,4,n4HBAVG,'go',4,n4HWAVG,'go',4,n4HeapAverage,'go',6, ...
    n6HBAVG,'ro',6,n6HWAVG,'ro',6,n6HeapAverage,'ro', ...
    8,n8HBAVG,'bo',8,n8HWAVG,'bo',8,n8HeapAverage,'bo'), grid; 
ylim([0,70]);
xlabel('Array Size');
ylabel('Comparisons');
title('Heap');

subplot(2,2,3); 
plot(c0,c0.^2, c0, c0.*log(c0),c0,c0,4,n4QBAVG,'go',4,n4QWAVG,'go',4,n4QuickAverage,'go',6, ...
    n6QBAVG,'ro',6,n6QWAVG,'ro',6,n6QuickAverage,'ro', ...
    8,n8QBAVG,'bo',8,n8QWAVG,'bo',8,n8QuickAverage,'bo'), grid; 
ylim([0,70]); 
xlabel('Array Size');
ylabel('Comparisons');
title('Quick');

subplot(2,2,4); 
plot(c0,c0.^2, c0, c0.*log(c0),c0,c0,4,n4SBAVG,'go',4,n4SWAVG,'go',4,n4ShakerAverage,'go',6, ...
    n6SBAVG,'ro',6,n6SWAVG,'ro',6,n6ShakerAverage,'ro', ...
    8,n8SBAVG,'bo',8,n8SWAVG,'bo',8,n8ShakerAverage,'bo'), grid; 
ylim([0,70]); 
xlabel('Array Size');
ylabel('Comparisons');
title('Shaker');


